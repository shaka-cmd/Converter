package com.example.webtechseth;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;

@WebServlet(name = "register", value = "/register")
public class Register extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ServletException {
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String gender = request.getParameter("gender");
        String date = request.getParameter("date");
        String address = request.getParameter("address");
        String phone = request.getParameter("number");
        String parent = request.getParameter("parent");
        String email = request.getParameter("egmails");
        String pswd = request.getParameter("pswd");
        String cpswd = request.getParameter("pswds");

        request.setAttribute("getFname",fname);
        request.setAttribute("getLname",lname);
        request.setAttribute("getGender",gender);
        request.setAttribute("getDate",date);
        request.setAttribute("getAddress",address);
        request.setAttribute("getPhone",phone);
        request.setAttribute("getParent",parent);
        request.setAttribute("getEmail",email);
        request.setAttribute("getPass",pswd);
        request.setAttribute("getConfirm",cpswd);

        request.getRequestDispatcher("display.jsp").forward(request, response);
    }
}

