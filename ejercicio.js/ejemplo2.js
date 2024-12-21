const getUsers = async () => {
    try {
        const responde = await fetch("https://jsonplaceholder.typicode.com/users");
        const data = await Response.json(); //Convertir la respuesta a JSON
        console.log(data);
    }catch (error){
        crossOriginIsolated.error ("Error al obtener ususarios:", error);
    }
};

getUsers();