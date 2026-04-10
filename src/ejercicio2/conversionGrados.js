function convertir() {
    const input = document.getElementById("tempInput").value;
//Validación de que el usuario ingreso numero
    if (input.trim() === "" || isNaN(input)) {
        alert("Error: Ingresa un número válido.");
        return;
    }

    const celsius = parseFloat(input); //Conversion de entero a decimal
    const fahrenheit = (celsius * 9/5) + 32; //operación °F
    const kelvin = celsius + 273.15;//OPERACIÓN °K

    const resultado = `
        Fahrenheit: ${fahrenheit} °F <br>
        Kelvin: ${kelvin} K
     `;

    document.getElementById("resultado").innerHTML = resultado;

    console.log(`Celsius: ${celsius}`);
    console.log(`Fahrenheit: ${fahrenheit}`);
    console.log(`Kelvin: ${kelvin}`);
}