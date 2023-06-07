package com.model.service;

import com.model.dao.MemDAO;
import com.model.dto.MemDTO;

import java.sql.Connection;
import java.util.List;

import static com.common.jdbc.JDBCTemplate.*;

public class MemberService {

    private final MemDAO memDAO;

    public MemberService() {
        memDAO = new MemDAO();
    }

    public MemDTO selectOneMemByCode(String memberCode) {

        /* Connection 생성 */
        Connection con = getConnection();

        /* Connection과 함께 정보를 전달하여 조회한다. */
        MemDTO selectedMem = memDAO.selectMemByCode(con, memberCode);

        /* connection 닫기 */
        close(con);

        /* 조회 결과를 반환한다. */
        return selectedMem;
    }

    /* 직원 정보 전체 조회용 메소드 */
    public List<MemDTO> selectAllMem() {

        /* Connection 생성 */
        Connection con = getConnection();

        /* 비지니스 로직 */
        /* 1. dao 호출하여 조회 */
        List<MemDTO> memList = memDAO.selectAllMemList(con);

        /* Connection 닫기 */
        close(con);

        /* 수행 결과 반환 */
        return memList;
    }

//    public String selectNewMemCode() {
//
//        /* Connection 생성 */
//        Connection con = getConnection();
//
//        /* 비지니스 로직 */
//        /* 1. dao 호출하여 조회 */
//        String newMemCode = memDAO.selectNewMemCode(con);
//
//        /* Connection 닫기 */
//        close(con);
//
//        /* 수행 결과 반환 */
//        return newMemCode;
//    }

    /* 신규 사원 등록용 메소드 */
    public int insertMem(MemDTO mem) {

        Connection con = getConnection();

        int result = memDAO.insertMem(con, mem);

        if (result > 0) {
            commit(con);
        } else {
            rollback(con);
        }

        close(con);

        return result;
    }

    public int updateMem(MemDTO mem) {

        Connection con = getConnection();

        int result = memDAO.updateMem(con, mem);

        if (result > 0) {
            commit(con);
        } else {
            rollback(con);
        }

        close(con);

        return result;
    }

    public int deleteMem(String memCode) {

        Connection con = getConnection();

        int result = memDAO.deleteMem(con, memCode);

        if (result > 0) {
            commit(con);
        } else {
            rollback(con);
        }

        close(con);

        return result;
    }

}
