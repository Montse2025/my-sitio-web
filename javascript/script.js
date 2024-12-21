// Seleccionamos el elemento con id "titulo"
const titulo = document.getElementById("titulo");

// Seleccionamos el boton con id "cambiarTexto"
const boton = document.getElementById("cambiarTexto");

// Añadimos un evento al boton para que al hacer clic, cambie el texto del titulo
boton.addEventListener("click", () =>{
    titulo.innerText = "Texto cambiar por JavaScript";
});

boton.addEventListener("click", () => {
    titulo.innerText = "Texto cambiado por JavaScript";
    titulo.style.color = "blue"; // Cambiar color del texto
});

const entrada = document.getElementById("entradaTexto");
const botonActualizar = document.getElementById("actualizarTexto");

botonActualizar.addEventListener("click", () => {
    titulo.innerText = entrada.value; // Cambiar el texto al valor del input
});