#!/usr/bin/env php
<?php

	$stdIn = fopen("php://stdin","r");
	$lineInput = fgets($stdIn);

	if($lineInput >= 1 && $lineInput <= 1000000000) {
		echo bindec(strrev(decbin($lineInput))), "\n";
	} else {
		echo "Invalid input\n";
	}


	fclose($stdIn);
?>
