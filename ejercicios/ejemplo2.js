const getUsers = async () => {
    try {
        const response = await fetch("https://jsonplaceholder.typicode.com/users");
        const data = await response.json(); //Convertir la respuesta a JSON
        console.log(data);
    }catch (error){
        cronsole.error("Error al obtener ususarios:", error);
    }
};

getUsers();