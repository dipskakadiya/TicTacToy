<%-- 
    Document   : index
    Created on : Apr 16, 2013, 2:30:14 AM
    Author     : sai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                margin-left: 500px;
            }
            .btnclass{
                width: 100px;
                padding: 2px;
            }
            .table{
                border: black double medium;
                border-color: black;
                margin: 20px;
            }
        </style>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script>
            $(document).ready(function(){
                var i=0;
                $("#btnstart").click(function(){
                    $("#playerinfo").attr("style","");
                });
                $("#btnok").click(function(){
                    $("#playerinfo").attr("style","display:none");
                    $(".gameele").removeAttr("disabled");
                });
                $(".gameele").click(function(){
                    if(i==0){
                        $(this).val($('#tocken1').val());
                        $(this).attr("disabled", "disabled");
                        i=1;
                    }else{
                        $(this).val($('#tocken2').val());
                        $(this).attr("disabled", "disabled");
                        i=0;
                    }
                    $.ajax({url:"Controller?Action=Checkresult&pl1="+ $('#player1').val()+"&tk1="+ $('#tocken1').val()+"&pl2="+ $('#player2').val()+"&tk2="+ $('#tocken2').val()+"&grid1="+$('#btn1').val()+"&grid2="+$('#btn2').val()+"&grid3="+$('#btn3').val()+"&grid4="+$('#btn4').val()+"&grid5="+$('#btn5').val()+"&grid6="+$('#btn6').val()+"&grid7="+$('#btn7').val()+"&grid8="+$('#btn8').val()+"&grid9="+$('#btn9').val(),success:function(result){
                            $("#div1").html(result);
                        }});
                });
                 $("#btnreset").click(function(){
                     i=0;
                     $("#btn1").removeAttr("disabled");
                      $("#btn2").removeAttr("disabled");
                      $("#btn3").removeAttr("disabled");
                     $("#btn4").removeAttr("disabled");
                      $("#btn5").removeAttr("disabled");
                      $("#btn6").removeAttr("disabled");
                      $("#btn7").removeAttr("disabled");
                      $("#btn8").removeAttr("disabled");
                      $("#btn9").removeAttr("disabled");
                     
                 });
            });
            
            
        </script>
    </head>
    <body>
        <h1 style="padding: 10px; margin-left: 80px;">Tic Tac Toe</h1>
        <table id="playerinfo"  class="table" style="display: none">
            <thead>
                <tr>
                    <th colspan="2">
                        Enter Information About PLayer
                    </th>
                </tr>
                <tr>
                    <th>Player Name</th>
                    <th>Tokens</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>
                        <input type="text" id="player1" name="player1" value=""/>
                    </td>
                    <td>
                        <input type="text" id="tocken1" name="tocken1" value=""/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" id="player2" name="player2" value=""/>
                    </td>
                    <td>
                        <input type="text" id="tocken2" name="tocken2" value=""/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="button" style="margin-left:110px;" class="btnclass" name="btnok" id="btnok" value="Ok"/>
                    </td>
                </tr>
            </tbody>
        </table>
        <table class="table">
            <tbody>
                <tr>
                    <td><input class="btnclass gameele" type="button" name="btn1" id="btn1" disabled="disabled" value=""/></td>
                    <td><input class="btnclass gameele" type="button" name="btn2" id="btn2" disabled="disabled" value=""/></td>
                    <td><input class="btnclass gameele" type="button" name="btn3" id="btn3" disabled="disabled" value=""/></td>
                </tr>
                <tr>
                    <td><input class="btnclass gameele" type="button" name="btn4" id="btn4" disabled="disabled" value=""/></td>
                    <td><input class="btnclass gameele" type="button" name="btn5" id="btn5" disabled="disabled" value=""/></td>
                    <td><input class="btnclass gameele" type="button" name="btn6" id="btn6" disabled="disabled" value=""/></td>
                </tr>
                <tr>
                    <td><input class="btnclass gameele" type="button" name="btn7" id="btn7" disabled="disabled" value=""/></td>
                    <td><input class="btnclass gameele" type="button" name="btn8" id="btn8" disabled="disabled" value=""/></td>
                    <td><input class="btnclass gameele" type="button" name="btn9" id="btn9" disabled="disabled" value=""/></td>
                </tr>
            </tbody>
        </table>

        <table  class="table">
            <tbody>
                <tr>
                    <td> <input type="button" name="btnstart" id="btnstart" value="Start"/></td>
                    <td> <input type="button" name="btnreset" id="btnreset" value="Reset"/></td>
                </tr>
            </tbody>
        </table>
        <div id="div1"></div>



    </body>
</html>
