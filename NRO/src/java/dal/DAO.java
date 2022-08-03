/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import model.Accounts;
import model.Cart;
import model.Category;
import model.Customer;
import model.Order;
import model.Products;

/**
 *
 * @author PC PHUC
 */
public class DAO {

    Connection conn = null;        //ket noi voi sql sever
    PreparedStatement ps = null;   //nem cau lenh query sang sql sever
    ResultSet rs = null;           //nhan ket qua tra ve

    public List<Products> getAllProduct() {
        List<Products> list = new ArrayList<>();
        String query = "select * from Products";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getString(12),
                        rs.getString(13)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from Category";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Accounts> getAllAccount(int id, int index) {
        List<Accounts> list = new ArrayList<>();
        String query = "select * from Accounts where ? = 1"
                + "ORDER BY uID\n"
                + "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, (index - 1) * 6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Accounts(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Products getDescribesByID(int id) {
        String query = "select * from Products"
                + " where NickID = ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Products(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getString(12),
                        rs.getString(13));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public Accounts getAccountByID(int id) {
        String query = "select * from Accounts where uID = ? ";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Accounts(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Products> getProductByCategory(int cid) {
        List<Products> list = new ArrayList<>();
        String query = "SELECT * FROM Products where CateID = ?\n";
//                "ORDER BY NickID\n" +
//                "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY; ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getString(12),
                        rs.getString(13)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Products> getProductBySellID(int id, int index) {
        List<Products> list = new ArrayList<>();
        String query = "select * from Products where SellID = ?\n"
                + "ORDER BY NickID\n"
                + "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY  ";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, id);
            ps.setInt(2, (index - 1) * 6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getString(12),
                        rs.getString(13)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Products> search(String txtSearch) {
        List<Products> list = new ArrayList<>();
        String query = "select * from Products where Price like ? or Plannet like ? or Sever like ? or NickID like ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            ps.setString(2, "%" + txtSearch + "%");
            ps.setString(3, "%" + txtSearch + "%");
            ps.setString(4, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getString(12),
                        rs.getString(13)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public Accounts login(String user, String pass) {
        String query = "SELECT * FROM Accounts WHERE [User] = ? AND Pass = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Accounts(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public Accounts checkAccountExist(String user) {
        String query = "SELECT * FROM Accounts WHERE [User] = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Accounts(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

    public void signUp(String user, String pass) {
        String query = "INSERT [Accounts] ([User], [Pass], [isAdmin]) VALUES (?,?,0)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public Accounts changePass(String pass, int id) {
        String query = "update Accounts set Pass = ? where uID = ?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, pass);
            ps.setInt(2, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Accounts(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Products> OrderByPriceDesc() {
        List<Products> list = new ArrayList<>();
        String query = "SELECT * FROM Products where SellID = 1\n"
                + "order by Price desc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getString(12),
                        rs.getString(13)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Products> OrderByPriceAsc() {
        List<Products> list = new ArrayList<>();
        String query = "SELECT * FROM Products where SellID = 1\n"
                + "order by Price asc";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getString(12),
                        rs.getString(13)));
            }
        } catch (Exception e) {
        }
        return list;
    }

    public void deleteProduct(String pid) {
        String query = "delete from Products where NickID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteAccount(String uid) {
        String query = "delete from Accounts where uID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, uid);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void insertProduct(String planet, String image, String price, String power,
            String intrinsic, String disciple, String levelSkill, String detailimage,
            String description, String sever, String category, int sid) {
        String query = "INSERT [Products] ([Sever], [Plannet], [Image], [Price], [CateID], [SellID], [Powers], [Intrinsic], [Disciple], [LevelSkill], [DetailImage], [Description])\n"
                + "VALUES (?, ?, ?, ?, ?, 1, ?, ?, ?, ?, ?, ?)";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, sever);
            ps.setString(2, planet);
            ps.setString(3, image);
            ps.setString(4, price);
            ps.setString(5, category);
            ps.setString(6, power);
            ps.setString(7, intrinsic);
            ps.setString(8, disciple);
            ps.setString(9, levelSkill);
            ps.setString(10, detailimage);
            ps.setString(11, description);

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void updatetProduct(String planet, String image, String price, String power,
            String intrinsic, String disciple, String levelSkill, String detailimage,
            String description, String sever, String category, String pid) {
        String query = "update Products set [Plannet] = ?, [Image] = ?, [Price] = ?, [Powers] = ?,"
                + " [Intrinsic] = ?, [Disciple] = ?, [LevelSkill] = ?, [DetailImage] = ?,"
                + " [Description] = ?, [Sever] = ?, [CateID] = ? where NickID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, planet);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, power);
            ps.setString(5, intrinsic);
            ps.setString(6, disciple);
            ps.setString(7, levelSkill);
            ps.setString(8, detailimage);
            ps.setString(9, description);
            ps.setString(10, sever);
            ps.setString(11, category);
            ps.setString(12, pid);

            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public int getTotalProduct() {
        String query = "select COUNT (*) from Products";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public int getTotalProductCate() {
        String query = "select COUNT (*) from Products where CateID = ?";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public int getTotalAccount() {
        String query = "select COUNT (*) from Accounts";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return 0;
    }

    public List<Products> pagingProduct(int index) {
        List<Products> list = new ArrayList<>();
        String query = "SELECT * FROM Products\n"
                + "ORDER BY NickID\n"
                + "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Products(rs.getInt(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getInt(11),
                        rs.getString(12),
                        rs.getString(13)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Accounts> pagingAccount(int index) {
        List<Accounts> list = new ArrayList<>();
        String query = "SELECT * FROM Accounts\n"
                + "ORDER BY uID\n"
                + "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY;";
        try {
            conn = new DBContext().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setInt(1, (index - 1) * 6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Accounts(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

//    public int OrderReturnId(Order order) {
//        try {
//            String sql = "INSERT INTO [dbo].[Order]\n" +
//                            "([UserID]\n" +
//                            "([nickID]\n" +
//                            ",[TotalPrice])\n" +
//                        "VALUES\n" +
//                            "(?,?,?)";
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, order.getUserID());
//            ps.setInt(2, order.getUserID());
//            ps.setInt(3, order.getTotalPrice());
//            ps.executeUpdate();
//
//            rs = ps.getGeneratedKeys();
//            if (rs.next()) {
//                return rs.getInt(1);
//            }
//
//        } catch (Exception ex) {
//            
//        }
//        return 0;
//    }
//    
//    public void saveCart(int orderId, Map<Integer, Cart> carts) {
//        try {
//
//            String sql = "INSERT INTO [dbo].[OrderDetail]\n" +
//            "           ([OrderID]\n" +
//            "           [NickID]\n" +
//            "           ,[Planet]\n" +
//            "           ,[NickPrice])\n" +
//            "     VALUES\n" +
//            "           (?,?,?,?)";
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1, orderId);
//            for (Map.Entry<Integer, Cart> entry : carts.entrySet()) {
//                Integer nickID = entry.getKey();
//                Cart cart = entry.getValue();
//                ps.setInt(2, cart.getProduct().getNickID());
//                ps.setString(3, cart.getProduct().getPlanet());
//                ps.setInt(4, cart.getProduct().getMoney());
//                ps.executeUpdate();
//            }
//
//        } catch (Exception ex) {
//        }
//    }
//    
//    public int CustomeReturnId(Customer cus) {
//        try {
//            String sql = "INSERT INTO [dbo].[Customer]\n" +           
//            "           ,[PaymentAccount]\n" +
//            "           ,[NamePaymentAccount]\n" +
//            "           ,[InfomationOfUser])\n" +
//            "     VALUES\n" +
//            "           (?,?,?,?)";
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setString(1, cus.getPaymentAccount());
//            ps.setString(2, cus.getNamePaymentAccount());
//            ps.setString(3, cus.getInfoUser());
//            ps.executeUpdate();
//            
//            rs = ps.getGeneratedKeys();
//            if(rs.next()){
//                return rs.getInt(1);
//            }
//            
//        } catch (Exception ex) {
//        }
//        return 0;
//    }
    public static void main(String[] args) {
        DAO dao = new DAO();

//        Accounts a = dao.login("Admin", "123");
//        System.out.println(a);
        List<Category> list = dao.getAllCategory();
        for (Category o : list) {
            System.out.println(o);
        }

//       Products d = dao.getDescribesByID(2);
//        System.out.println(d);
//        
//        int c = dao.getTotalProduct();
//        System.out.println(c);
    }

}
