const getPokemon = async (name) => {
    try {
        const response = await fetch(`https://pokeapi.co/api/v2/pokemon/${name}`);
        if (!response.ok) throw new Error("Pokémon no encontrado");
        const data = await response.json();
        console.log(`Nombre: ${data.name}, Tipo: ${data.types[0].type.name}`);
    }catch (error) {
        console.error("Error:", error.message);
    }
};

getPokemon("pikachu");