<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bilgi ekle sayfası</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

</head>

<body>



<div class = "container">

	<h1>Kişi Ekle</h1>
	<%
	
		boolean hataDurum = (boolean)request.getAttribute("errors");
	
	if(hataDurum){
		
		if(request.getAttribute("adi_errors") != null){
			String adi = (String)request.getAttribute("adi_errors");
			%>
				<div class="alert alert-danger"><% out.println(adi); %> </div>
			<% 	
		}
		
	
	}
	%>
<form action="KayitEkle" method="post">

	<div class="row">
		<div class="col-md-2">
			<label>Adınız :</label>
		</div>
		<div class = "col-md-8">
			<input type = "text" name = "adi" class="form-control"/>
		</div>
	</div>
	
	<div class="row">
		<div class = "col-md-2">
			<label>Soyadınız :</label>
		</div>
		<div class = "col-md-8">
			<input type = "text" name = "soyadi" class="form-control"/>
		</div>
	</div>
	
	<div class="row">
		<div class = "col-md-2">
			<label>TC Numarası:</label>
		</div>
		<div class = "col-md-8">
			<input type = "text" name = "tc" class="form-control" />
		</div>
	</div>
	
	<div class="row">
		<div class = "col-md-2">
			<label>Okul :</label>
		</div>
		<div class = "col-md-8">
			<input type = "text" name = "okul" class="form-control">
		</div>
	</div>
	
	<div class = "row">
		<div class = "col-md-2">
			<label>Yaşınız :</label>
		</div>
		
		<div class = "col-md-8">
			<input type = "text" name="yas" class="form-control" />
		</div>
	</div>
	
	<div class = "row">
		<div class = "col-md-3">
			<input type = "submit" value="Kaydet" class="btn btn-lg btn-success"/>
		</div>
	
	</div>
	
</form>
</div>





<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

</body>
</html>