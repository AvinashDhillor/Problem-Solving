const readline = require('readline');
const fs = require('fs');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.question('Enter problem name? ', (name) => {
    var array = name.split(" ");
    var number = array[0];
    array = array.slice(1);
    var newName = array.join("_") + "_" + number.substring(0, number.length - 1);
    console.log(newName);
    fs.writeFile(`${newName}.java`, "", (e) => {
        if (!e) {
            console.log("File is created!");
        }
    });
    rl.close();
});