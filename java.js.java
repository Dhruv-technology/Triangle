function calculate() {
    // Input three side lengths of the triangle
    const x = parseFloat(document.getElementById("side1").value);
    const y = parseFloat(document.getElementById("side2").value);
    const z = parseFloat(document.getElementById("side3").value);

    // Validate input
    if (isNaN(x) || isNaN(y) || isNaN(z) || x <= 0 || y <= 0 || z <= 0) {
        alert("Please enter valid positive numbers for the side lengths.");
        return;
    }

    // Calculate the perimeter of the triangle
    const perimeter = x + y + z;
    document.getElementById("perimeter").textContent = perimeter;

    // Calculate the semi-perimeter of the triangle
    const semiperimeter = perimeter / 2;
    document.getElementById("semiperimeter").textContent = semiperimeter;

    // Heron's Formula: Calculate the area of the triangle
    const s = semiperimeter; // Short variable for semiperimeter
    const area = Math.sqrt(s * (s - x) * (s - y) * (s - z));
    document.getElementById("area").textContent = area.toFixed(2);
}
if (document.getElementById("area").textContent === "NaN") {
  document.getElementById("NaNWarning").textContent = "The NaN (Not-a-Number) result in the area field typically occurs when the input values for the sides of the triangle do not form a valid triangle according to the triangle inequality theorem. The triangle inequality theorem states that the sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the remaining side. In the context of Heron's formula for calculating the area of a triangle, if the input values of x, y, and z do not satisfy the triangle inequality theorem, you'll get a negative number or the square root of a negative number, which results in NaN. To avoid this issue, make sure that the sum of the lengths of any two sides of the triangle is greater than the length of the remaining side. For example, for a triangle with sides x, y, and z, you should have: x + y > z, x + z > y, y + z > x";
}

