const getUsers = async () => {
    try {
        const response = await fetch ("https://jsonplaceholder.typicode.com/users");
        if (!responde,ok) {
        }
        const data = await responde.json();
        console.log(data);
    }catch (error) {
        consosle.errror("Error al obtener ususarios:", error);
    }
}