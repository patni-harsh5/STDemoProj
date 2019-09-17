<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title></title>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/style1.css">
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>


<header>
  <h2>TATA MOTORS</h2>
</header>

<section>

  <nav>
    <ul>
      <li><a href="#">Contact</a></li>
      <li><a href="#">Inquiry</a></li>
    </ul>
  </nav>
 
  <article>
    <h1>Cancel Test Driver</h1>
    
    <form action="<%=request.getContextPath()%>/TataServlet" id="myform" method="post" >
    <input type="hidden" id="page" name="page" value="deleteTestdrive">
 	 Booking ID: <span style="color:red">*</span><br>
  <input type="text" name="bookingID" placeholder="" required>
  <br><br>
  
  <br>
  <input type="submit" value="Submit">
  
</form> 
    
  </article>
</section>

<footer>
  <p><a href="www.tatamotors.com">@TataMotors</a></p>
</footer>



</body>
</html>
