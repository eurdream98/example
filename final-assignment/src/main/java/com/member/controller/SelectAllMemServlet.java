package com.member.controller;

import com.model.dto.MemDTO;
import com.model.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/member/list")
public class SelectAllMemServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        MemberService memService = new MemberService();
        List<MemDTO> memList = memService.selectAllMem();

        for(MemDTO mem : memList) {
            System.out.println(mem);
        }

        /* 조회 결과 성공 여부에 따른 뷰 결정 */
        String path = "";
        if(memList != null) {
            path = "/view/member/memberList.jsp";
            request.setAttribute("memList", memList);
        } else {
            path = "/view/common/errorPage.jsp";
            request.setAttribute("message", "vip 목록 조회 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);

    }

}