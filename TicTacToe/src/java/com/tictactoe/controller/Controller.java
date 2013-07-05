/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tictactoe.controller;

import com.tictactoe.model.Player;
import com.tictactoe.model.tictactoe;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sai
 */
public class Controller extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.print("called");
       if(request.getParameter("Action").equals("Checkresult")){
          Player pl1=new Player();
          pl1.setName(request.getParameter("pl1"));
          pl1.setTocken(request.getParameter("tk1").charAt(0));
          Player pl2=new Player();
          pl2.setName(request.getParameter("pl2"));
          pl2.setTocken(request.getParameter("tk2").charAt(0));
          tictactoe t=new tictactoe();
          if(request.getParameter("grid1")!=null && request.getParameter("grid1").length()>0){
          t.setBtn1(request.getParameter("grid1").charAt(0));}
           if(request.getParameter("grid2")!=null && request.getParameter("grid2").length()>0){
          t.setBtn2(request.getParameter("grid2").charAt(0));}
           if(request.getParameter("grid3")!=null && request.getParameter("grid3").length()>0){
          t.setBtn3(request.getParameter("grid3").charAt(0));}
           if(request.getParameter("grid4")!=null && request.getParameter("grid4").length()>0){
          t.setBtn4(request.getParameter("grid4").charAt(0));}
           if(request.getParameter("grid5")!=null && request.getParameter("grid5").length()>0){
          t.setBtn5(request.getParameter("grid5").charAt(0));}
          if(request.getParameter("grid6")!=null && request.getParameter("grid6").length()>0){
          t.setBtn6(request.getParameter("grid6").charAt(0));}
           if(request.getParameter("grid7")!=null && request.getParameter("grid7").length()>0){
          t.setBtn7(request.getParameter("grid7").charAt(0));}
           if(request.getParameter("grid8")!=null && request.getParameter("grid8").length()>0){
          t.setBtn8(request.getParameter("grid8").charAt(0));}
           if(request.getParameter("grid9")!=null && request.getParameter("grid9").length()>0){
          t.setBtn9(request.getParameter("grid9").charAt(0));}
          
          char res=t.check_result();
     
          if(res!='~'){
              if (pl1.getTocken()==res){
                request.setAttribute("result",pl1.getName());
              }else if (pl2.getTocken()==res){
                  request.setAttribute("result",pl2.getName());
              }        
          }
          
       }
       RequestDispatcher rd=request.getRequestDispatcher("result.jsp");
              rd.forward(request, response); 
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
