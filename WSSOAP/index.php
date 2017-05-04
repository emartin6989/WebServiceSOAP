<?php
$montant=0; $resultat=0;
if (isset($_GET['mt']))
{
	$montant = $_GET['mt'];
	$client = new SoapClient("http://localhost:8585/BanqueWS?wsdl");
	$param = new stdClass();
	$param->mt=$montant;
	$res = $client->__soapCall("ConversionED",array($param));
	$resultat=$res->return;
}
?>
<html>
<body>
<form action="index.php">
Montant :<input type="text" name="mt" value="<?php echo($montant)?>"/>
<input type="submit" value="OK"/>
</form>
<?php echo($montant)?> en Euro = <?php echo($resultat)?> en Dollar
</body>
</html>