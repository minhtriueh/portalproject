<%-- 
    Document   : index
    Created on : 19-08-2010, 14:31:13
    Author     : sanchikaro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Table demo</title>
        <link rel="stylesheet" type="text/css" href="styles.css" />
    </head>
    <body>
        <h1>Hello World!</h1>
        <table id="mytable" cellspacing="0" summary="The technical
            specifications of the Apple PowerMac G5 series">
            <caption>Table 1: Power Mac G5 tech specs </caption>
            <tr>
            <th scope="col" abbr="Configurations" class="nobg">Configurations</th>

            <th scope="col" abbr="Dual 1.8">Dual 1.8GHz</th>
            <th scope="col" abbr="Dual 2">Dual 2GHz</th>
                <th scope="col" abbr="Dual 2.5">Dual 2.5GHz</th>
          </tr>
          <tr>
            <th scope="row" abbr="Model" class="spec">Model</th>
            <td>M9454LL/A</td>

            <td>M9455LL/A</td>
            <td>M9457LL/A</td>
          </tr>
          <tr>
            <th scope="row" abbr="G5 Processor" class="specalt">G5 Processor</th>
            <td class="alt">Dual 1.8GHz PowerPC G5</td>
            <td class="alt">Dual 2GHz PowerPC G5</td>

            <td class="alt">Dual 2.5GHz PowerPC G5</td>
          </tr>
          <tr>
            <th scope="row" abbr="Frontside bus" class="spec">Frontside bus</th>
            <td>900MHz per processor</td>
            <td>1GHz per processor</td>
            <td>1.25GHz per processor</td>

          </tr>
          <tr>
            <th scope="row" abbr="L2 Cache" class="specalt">Level2 Cache</th>
            <td class="alt">512K per processor</td>
            <td class="alt">512K per processor</td>
            <td class="alt">512K per processor</td>
          </tr>
        </table>
    </body>
</html>
