<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EUR Capitals Distance Calculator</title>
</head>
<body>

<h1>EUR Capitals Distance Calculator</h1>

<form action="" method="post">
    <label for="startCity">Start City:</label>
    <select name="startCity" id="startCity">
        <?php
        $Distances = getDistances();
        $KMtoMiles = 0.62;
        foreach ($Distances as $city => $destinations) {
            echo "<option value=\"$city\">$city</option>";
        }
        ?>
    </select>

    <label for="endCity">End City:</label>
    <select name="endCity" id="endCity">

        <?php
        function getDistances()
        {
            return array(
                "Berlin" => array("Berlin" => 0, "Moscow" => 1607.99, "Paris" => 879.96, "Prague" => 280.34, "Rome" => 1181.67),
                "Moscow" => array("Berlin" => 1607.99, "Moscow" => 0, "Paris" => 2484.92, "Prague" => 1664.04, "Rome" => 2374.26),
                "Paris" => array("Berlin" => 876.963, "Moscow" => 641.31, "Paris" => 0, "Prague" => 885.38, "Rome" => 1105.76),
                "Prague" => array("Berlin" => 280.34, "Moscow" => 1664.04, "Paris" => 885.38, "Prague" => 0, "Rome" => 922),
                "Rome" => array("Berlin" => 1181.67, "Moscow" => 2374.26, "Paris" => 1105.76, "Prague" => 922, "Rome" => 0));
        }

        $Distances = getDistances();
        foreach ($Distances as $city => $destinations) {
            echo "<option value=\"$city\">$city</option>";
        }
        ?>
    </select>
    <input type="submit" name="calculateDistance" value="Calculate Distance">
</form>

<?php
if (isset($_POST['calculateDistance'])) {
    // Get user-selected start and end cities
    $startCity = $_POST['startCity'];
    $endCity = $_POST['endCity'];

    // Check if both cities are valid
    if (isset($Distances[$startCity]) && isset($Distances[$endCity])) {
        // Calculate and display the distance
        $distance = $Distances[$startCity][$endCity];
        $distanceInMiles = $distance * $KMtoMiles;

        echo "<p>The distance from $startCity to $endCity is: $distance km (approximately " . number_format($distanceInMiles, 2) . " miles).</p>";
    } else {
        echo "<p>Please select valid start and end cities.</p>";
    }
}
?>

</body>
</html>