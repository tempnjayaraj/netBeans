
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author johns
 */
@WebServlet(urlPatterns = "/login")
public class dbValidate extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        String otpfromUI = request.getParameter("OTP");
        Integer num = userLogin.otp;
        String otpfromServlet = num.toString();
        if(otpfromUI.equals(otpfromServlet)){
        String usrName;
        String name = userLogin.name;
        String role ="";
        List<String> perList = new ArrayList<>();
        try {
            
        JSONParser parser = new JSONParser();
        String filePath = getServletContext().getRealPath("/WEB-INF/Files/RolesAndPermissions.json");
        JSONObject jsonObject;
        jsonObject = (JSONObject) parser.parse(new FileReader(filePath));
        JSONArray roleGroup = (JSONArray) jsonObject.get("roleGroup");
        Iterator roleItr = roleGroup.iterator();
        while (roleItr.hasNext()) {
            JSONObject singleRole = (JSONObject) roleItr.next();
            Set roleNameKey = singleRole.keySet();
            Iterator roleName = roleNameKey.iterator();
            while (roleName.hasNext()) {
                JSONObject singgleRole = (JSONObject) singleRole.get(roleName.next());

                JSONArray users = (JSONArray) singgleRole.get("users");
                Iterator usr = users.iterator();
                usrName = "";
                while (usr.hasNext()) {
                    usrName = (String) usr.next();
                    if (name.equals(usrName)) {
                        Set set = singleRole.keySet();
                        Iterator us = set.iterator();
                        while (us.hasNext()) {
                            role = (String) us.next();
                            JSONArray permissions = (JSONArray) singgleRole.get("permissions");
                            Iterator prm = permissions.iterator();

                            while (prm.hasNext()) {
                                String temp = (String) prm.next();
                                perList.add(temp);
                            }
                            break;
                        }
                    }
                }

            }
        }
        Date date = new Date();
        System.out.println("User " + name + " has logged in as " + role + " at " + date + ". The user has the following permissions");
        System.out.println(perList);
        request.setAttribute("role", role);
        request.setAttribute("user", name);
        request.setAttribute("list", perList);
        request.getRequestDispatcher("WEB-INF/Views/MainPage.jsp").
                forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(dbValidate.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else{
            request.setAttribute("wrongOTP", "Incorrect OTP provided");
            request.getRequestDispatcher("WEB-INF/Views/login.jsp").
                forward(request, response);
        }
    }
}
