package com.member.controller;

import com.model.dto.MemDTO;
import com.model.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/update")
public class UpdateMemServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String memberCode = request.getParameter("memCode");
        String birthDate = request.getParameter("birthDate");

        MemDTO mem = new MemDTO();
        mem.setMemberCode(memberCode);
        mem.setBirthDate(birthDate);

        int result = new MemberService().updateMem(mem);

        String path = "";
        if(result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "updateEmp");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "회원 정보 수정 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}
