package com.member.controller;

import com.model.dto.MemDTO;
import com.model.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/member/insert")
public class InsertMemServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String memCode = request.getParameter("memCode");
        String memName = request.getParameter("memName");
        String memGender = request.getParameter("memGender");
        String birthDate = request.getParameter("birthDate");
        String divisionCode = request.getParameter("divisionCode");
        String memberAddress = request.getParameter("memberAddress");
        String contact	= request.getParameter("contact");
        String gradeCode = request.getParameter("gradeCode");
        String activeStatus = request.getParameter("activeStatus");



        MemberService memberService = new MemberService();


        MemDTO mem = new MemDTO();

        mem.setMemberCode(memCode);
        mem.setMemberName(memName);
        mem.setMemberGender(memGender);
        mem.setBirthDate(birthDate);
        mem.setDivisionCode(divisionCode);
        mem.setMemberAddress(memberAddress);
        mem.setContact(contact);
        mem.setGradeCode(gradeCode);
        mem.setActiveStatus(activeStatus);


        System.out.println("insert request mem : " + mem);

        int result = memberService.insertMem(mem);

        String path = "";
        if(result > 0) {
            path = "/view/common/successPage.jsp";
			request.setAttribute("message", "신규 vip 등록에 성공하셨습니다.");
			response.sendRedirect(request.getContextPath() + "/view/common/successPage.jsp");

            request.setAttribute("successCode", "insertMem");
        } else {
            path = "/view/common/errorPage.jsp";
            request.setAttribute("message", "신규 vip 등록에 실패하셨습니다.");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }

}