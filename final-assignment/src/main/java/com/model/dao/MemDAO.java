package com.model.dao;

import com.common.config.ConfigLocation;
import com.model.dto.MemDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.common.jdbc.JDBCTemplate.close;

public class MemDAO {

    private final Properties prop;

    public MemDAO() {

        prop = new Properties();
        try {
            prop.loadFromXML(new FileInputStream(ConfigLocation.MAPPER_LOCATION + "member-mapper.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public MemDTO selectMemByCode(Connection con, String memberCode) {

        PreparedStatement pstmt = null;
        ResultSet rset = null;

        MemDTO selectedMem = null;

        String query = prop.getProperty("selectMemByCode");

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, memberCode);

            rset = pstmt.executeQuery();

            if (rset.next()) {
                selectedMem = new MemDTO();

                selectedMem.setMemberCode(rset.getString("MEMBER_CODE"));
                selectedMem.setMemberName(rset.getString("MEMBER_NAME"));
                selectedMem.setMemberGender(rset.getString("MEMBER_GENDER"));
                selectedMem.setBirthDate(rset.getString("BIRTH_DATE"));
                selectedMem.setDivisionCode(rset.getString("DIVISION_CODE"));
                selectedMem.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
                selectedMem.setContact(rset.getString("CONTACT"));
                selectedMem.setGradeCode(rset.getString("GRADE_CODE"));
                selectedMem.setActiveStatus(rset.getString("ACTIVE_STATUS"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(pstmt);
        }

        return selectedMem;
    }

    /* employee 테이블의 전체 목록 조회 */
    public List<MemDTO> selectAllMemList(Connection con) {

        Statement stmt = null;
        ResultSet rset = null;

        List<MemDTO> memList = null;

        String query = prop.getProperty("selectAllMemList");

        try {
            stmt = con.createStatement();
            rset = stmt.executeQuery(query);

            memList = new ArrayList<>();

            while (rset.next()) {
                MemDTO mem = new MemDTO();
                mem.setMemberCode(rset.getString("MEMBER_CODE"));
                mem.setMemberName(rset.getString("MEMBER_NAME"));
                mem.setMemberGender(rset.getString("MEMBER_GENDER"));
                mem.setBirthDate(rset.getString("BIRTH_DATE"));
                mem.setDivisionCode(rset.getString("DIVISION_CODE"));
                mem.setMemberAddress(rset.getString("MEMBER_ADDRESS"));
                mem.setContact(rset.getString("CONTACT"));
                mem.setGradeCode(rset.getString("GRADE_CODE"));
                mem.setActiveStatus(rset.getString("ACTIVE_STATUS"));


                memList.add(mem);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(rset);
            close(stmt);
        }

        return memList;
    }

//    public String selectNewMemCode(Connection con) {
//        PreparedStatement pstmt = null;
//        ResultSet rset = null;
//
//        String newMemCode = null;
//
//        String query = prop.getProperty("selectNewMemCode");
//
//        try {
//            pstmt = con.prepareStatement(query);
//
//            rset = pstmt.executeQuery();
//
//            if (rset.next()) {
//                newMemCode = rset.getString("MEMBER_CODE");
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            close(rset);
//            close(pstmt);
//        }
//
//        return newMemCode;
//    }

    /* employee 테이블에 insert 하는 메소드 */
    public int insertMem(Connection con, MemDTO mem) {

        PreparedStatement pstmt = null;

        int result = 0;

        String query = prop.getProperty("insertMem");

        try {
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, mem.getMemberName());
            pstmt.setString(2, mem.getMemberGender());
            pstmt.setString(3, mem.getBirthDate());
            pstmt.setString(4, mem.getDivisionCode());
            pstmt.setString(5, mem.getMemberAddress());
            pstmt.setString(6, mem.getContact());
            pstmt.setString(7, mem.getGradeCode());
            pstmt.setString(8, mem.getActiveStatus());


            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }

        return result;
    }


    public int updateMem(Connection con, MemDTO mem) {

        PreparedStatement pstmt = null;

        int result = 0;

        String query = prop.getProperty("updateMem");

        try {
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, mem.getMemberCode());
            pstmt.setString(2,mem.getMemberName());
            pstmt.setString(3,mem.getMemberGender());
            pstmt.setString(4, mem.getBirthDate());
            pstmt.setString(5,mem.getDivisionCode());
            pstmt.setString(6,mem.getMemberAddress());
            pstmt.setString(7,mem.getContact());
            pstmt.setString(8,mem.getGradeCode());
            pstmt.setString(9,mem.getActiveStatus());
            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }

        return result;
    }


    public int deleteMem(Connection con, String memCode) {

        PreparedStatement pstmt = null;

        int result = 0;

        String query = prop.getProperty("deleteMem");

        try {
            pstmt = con.prepareStatement(query);
            pstmt.setString(1, memCode);

            result = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
        }

        return result;
    }

}