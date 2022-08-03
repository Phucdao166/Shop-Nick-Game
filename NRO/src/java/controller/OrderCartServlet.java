/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Accounts;
import model.Cart;
import model.Customer;
import model.Order;
import model.Products;

/**
 *
 * @author PC PHUC
 */
public class OrderCartServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           HttpSession session = request.getSession();
           Accounts acc = (Accounts) session.getAttribute("acc");
            if(acc ==null){
                response.sendRedirect("login.jsp");
                return;
            }
            Map<Integer, Cart> cart = (Map<Integer, Cart>) session.getAttribute("cart");
            if (cart == null) {
                cart = new LinkedHashMap<>();
            }
            Accounts a = (Accounts) session.getAttribute("acc");
            int id = a.getId();
            String indexPage = request.getParameter("index");
            if(indexPage == null){
                indexPage = "1";
            }
            int index = Integer.parseInt(indexPage);                   
            DAO dao = new DAO();
            int count = dao.getTotalProduct();
            int endPage = count / 6;
            if(count % 6 != 0){
                endPage++;
            }
            List<Products> list = dao.getProductBySellID(id, index);
            
            request.setAttribute("pageP", list);
            //tinh tong tien
            int totalMoney = 0;
            for (Map.Entry<Integer, Cart> entry : cart.entrySet()) {
                Integer nickID = entry.getKey();
                Cart cart1 = entry.getValue();
                totalMoney += 1 * cart1.getProduct().getMoney();
            }
            request.setAttribute("totalMoney", totalMoney);
            request.setAttribute("cart", cart);
            request.getRequestDispatcher("order.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
//        String paymentAccount = request.getParameter("paymentAccount");
//        String namePaymentAccount = request.getParameter("namePaymentAccount");
//        String infoUser = request.getParameter("infoUser");
//        int id = Integer.parseInt(request.getParameter("userID"));
//        
//        Customer cus = Customer.builder().paymentAccount(paymentAccount).namePaymentAccount(namePaymentAccount).infoUser(infoUser).build();
//        int cusID = new DAO().CustomeReturnId(cus);
//        
        HttpSession session = request.getSession();
//        Map<Integer, Cart> cart = (Map<Integer, Cart>) session.getAttribute("cart");
//        if (cart == null) {
//            cart = new LinkedHashMap<>();
//        }
//
//        //tinh tong tien
//        int totalPrice = 0;
//        for (Map.Entry<Integer, Cart> entry : cart.entrySet()) {
//            Integer nickID = entry.getKey();
//            Cart cart1 = entry.getValue();
//
//            totalPrice += 1 * cart1.getProduct().getMoney();
//
//        }
//        
//        Order order = Order.builder().totalPrice(1).totalPrice(totalPrice).build();
//        int orderId = new DAO().OrderReturnId(order);
//        
//        new DAO().saveCart(orderId, cart);
        
        session.removeAttribute("cart");
        response.sendRedirect("thanks");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
