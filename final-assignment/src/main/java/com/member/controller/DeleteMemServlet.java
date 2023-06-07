package com.member.controller;

import com.model.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/delete")
public class DeleteMemServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String memCode = request.getParameter("memCode");

        int result = new MemberService().deleteMem(memCode);

        String path = "";
        if(result > 0) {
            path = "/view/common/successPage.jsp";
            request.setAttribute("successCode", "deleteMem");
        } else {
            path = "/view/common/errorPage.jsp";
            request.setAttribute("message", "vip 삭제 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}