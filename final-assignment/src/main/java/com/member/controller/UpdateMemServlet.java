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
        String memberName = request.getParameter("memberName");
        String memberGender = request.getParameter("memberGender");
        String birthDate = request.getParameter("birthDate");
        String divisionCode=request.getParameter("divisionCode");
        String memberAddress=request.getParameter("memberAddress");
        String contact=request.getParameter("contact");
        String gradeCode=request.getParameter("gradeCode");
        String activeStatus=request.getParameter("activeStatus");
        MemDTO mem = new MemDTO();
        mem.setMemberCode(memberCode);
        mem.setMemberName(memberName);
        mem.setMemberGender(memberGender);
        mem.setBirthDate(birthDate);
        mem.setDivisionCode(divisionCode);
        mem.setMemberAddress(memberAddress);
        mem.setContact(contact);
        mem.setGradeCode(gradeCode);
        mem.setActiveStatus(activeStatus);
        int result = new MemberService().updateMem(mem);

        String path = "";
        if(result > 0) {
            path = "/view/common/successPage.jsp";
            request.setAttribute("successCode", "updateEmp");
        } else {
            path = "/view/common/errorPage.jsp";
            request.setAttribute("message", "vip 정보 수정 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}
