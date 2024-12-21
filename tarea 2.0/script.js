// Seleccionamos los elementos 
const button = document.getElementById('showText');
const outputDiv = document.getElementById('output');

// Añadimos un evento al botón
button.addEventListener("click", () => {
    const inputText = document.getElementById('inputText').value;

// Creamos un array con el texto repetido 5 veces usando map
    const repeatedText = Array(5)
        .fill(inputText)
        .map((t, i) => `<p>${i + 1}: ${t}</p>`);

    // Mostramos el resultado en el div de salida
    outputDiv.innerHTML = repeatedText.join('');
});