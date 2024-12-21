for ( let i = 0; i < 5; i++) {
    console.log("Iteraccion numero" +i)
}

console.log("--------------------------------------");

let j = 0;
while (j < 5) {
    console.log("Iteracion con while:" + j);
    j++;
}

console.log("--------------------------------------");

let edad = 18;
if(edad >= 18){
    console.log("Eres mayor de edad");
} else {
    console.log("Eres menor de edad");
}

console.log("--------------------------------------------");

//Operador Ternario
let mensaje = edad >= 18 ? "Mayor de edad" : "Menor de edad";
console.log(mensaje);

console.log("-------------------------------------------")

let.numeros=[1,2,3,4,5];
numeros.push(5);
console.log(numeros);//[1,2,3,4,5]

//Ejemplos de objestos
let personas ={
    nombre: Juan,
    edad: 30,
    ciudad: Villarrica,
};
console.log("Hola soy", persona.nombres);
