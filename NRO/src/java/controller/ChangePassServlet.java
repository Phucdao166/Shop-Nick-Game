/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Accounts;

/**
 *
 * @author PC PHUC
 */
public class ChangePassServlet extends HttpServlet {

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
           int id = Integer.parseInt(request.getParameter("id"));
           String oldPass = request.getParameter("oldpass");
           String newPass = request.getParameter("newpass");
           String rePass = request.getParameter("repass");
           if(!newPass.equals(rePass)){
               request.setAttribute("mess", "Pass and Repass not match!! Please enter the password again !!");
               request.getRequestDispatcher("changePass.jsp").forward(request, response);   
           }else{
                HttpSession session = request.getSession();           
                Accounts acc = (Accounts) session.getAttribute("acc");
                if(oldPass.equals(acc.getPass())){
                    DAO dao = new DAO();
                    Accounts a = dao.getAccountByID(id);
                    request.setAttribute("a", a);
                    dao.changePass(newPass, id);
                    request.getRequestDispatcher("information").forward(request, response);
                }else{
                    request.setAttribute("mess", "Password invalid !!");
                    request.getRequestDispatcher("changePass.jsp").forward(request, response);  
                }     
            }            
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
        processRequest(request, response);
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
