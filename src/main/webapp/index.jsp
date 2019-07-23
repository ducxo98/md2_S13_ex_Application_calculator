<%--
  Created by IntelliJ IDEA.
  User: duc
  Date: 23/07/2019
  Time: 08:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1> Simple Calculator</h1>
  <form action="/calculate" method="post" >
    <fieldset>
      <legend>Calculator</legend>
      <table>
        <tr>
          <td>First operand:</td>
          <td><input name="firstOperand" type="text"/> </td>
        </tr>
        <tr>
          <td>Operator:</td>
          <td> <select name="operator">
            <option value="+"> Addition</option>
            <option value="-"> Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
          </select>
          </td>
        </tr>
        <tr>
          <td>Second operand:</td>
          <td><input name="secondOperand" type="text"></td>
        </tr>
        <tr>
          <td><input type="submit" value="calculator"></td>
        </tr>
      </table>

    </fieldset>
  </form>
  </body>
</html>
