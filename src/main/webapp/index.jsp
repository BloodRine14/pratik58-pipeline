<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>

<head>
    <style>
        h1 {
            color: brown;
            font-weight: bold;
        }
        .grid-div {
            display: grid;
            flex-direction: column;
            justify-content: center;
            align-content: center;
        }
    </style>
</head>

<body>
<div class="grid-div">
    <h1>
        Result
    </h1>
    <% List result=(List) request.getAttribute("lottery"); Iterator it=result.iterator();
        out.println("<br>We have <br><br>");
        while(it.hasNext()){
            out.println(it.next()+"<br>");
        }
    %>
</div>

</body>

</html>