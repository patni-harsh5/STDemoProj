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

  <nav style="height: 562px; ">
    <ul>
      <li><a href="#">Contact</a></li>
      <li><a href="#">Inquiry</a></li>
    </ul>
  </nav>
 
  <article style="height: 562px; ">
    <h1>Book Test Drive</h1>
    <p id="alert"></p>
    <form action="<%=request.getContextPath()%>/TataServlet" id="myform" onSubmit="return validateCustomer()" method="post">
    <input type="hidden" id="page" name="page" value="addTestdrive">
 Customer Name: <span style="color:red">*</span><br>
  <input type="text" name="cname" placeholder="Name" required>
  <br><br>
  
   Booking ID: <span style="color:red">*</span><br>
  <input type="text" name="bookingID" placeholder="" required>
  <br><br>
 
  Driver License Number: <span style="color:red">*</span><br>
  <input type="text" name="dlc" placeholder="DL number" required>
  <br><br>
  
  Vehicle Make:<br>
    <select name="vehicle">
    <option value="zest">Tata Zest</option>
    <option value="safari">Tata Safari</option>
    <option value="manza">Tata Manza</option>
    </select><br><br>
 
 Test Drive Date: <span style="color:red">*</span><br>
  <input type="date" name="tdate" placeholder="mm/dd/yyyy" required>
  <br><br>
  
  <br>
  <input type="submit" value="Submit">
  <input type="reset" value="Clear">
</form> 
    
  </article>
</section>

<footer>
  <p><a href="www.tatamotors.com">@TataMotors</a></p>
</footer>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
<script src="../js/script1.js"></script>


</body>
</html>
