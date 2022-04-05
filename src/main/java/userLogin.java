
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author johns
 */
@WebServlet(urlPatterns = "/dbvalidate")
public class userLogin extends HttpServlet {

    static String name;
    static String pwd;
    static Integer otp;

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/Views/login.jsp").
                forward(request, response);
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        Boolean valid = false;
        name = request.getParameter("username");
        String usrName = null;
        pwd = request.getParameter("password");
        String user = null;
        String role = null;
        List<String> perList = new ArrayList();
        String sql = "select e_pass from user_table where e_name = '" + name + "'";
        try {
            String password = DataBase.createSingleResultSet(sql);
            if (password.equals(pwd)) {
                String emailQuery = "select e_email from user_table where e_name = '" + name + "'";
                String email = DataBase.createSingleResultSet_2(emailQuery);
                System.out.println(email);
                valid = true;
                request.setAttribute("email", email.replaceAll("(?<=.{3}).(?=[^@]+@)", "*"));
                Random rand = new Random();
                otp = rand.nextInt(10000);
                Play.send("tempnjayaraj@gmail.com", "prkstr@2022", email, "OTP for Authentication", otp);
                request.getRequestDispatcher("WEB-INF/Views/emailOTP.jsp").
                        forward(request, response);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (!valid) {
            request.setAttribute("error", "Please provide valid credentials");
            request.getRequestDispatcher("WEB-INF/Views/login.jsp").
                    forward(request, response);
        }

    }

}
