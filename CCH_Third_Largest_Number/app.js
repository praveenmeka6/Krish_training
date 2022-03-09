const readline = require("readline-sync");

let str1 = readline.question('enter the sequence (leave space between numbers) :');

let arr = str1.split(' ');

for (let index = 0; index < arr.length; index++) {
    arr[index] = parseInt(arr[index]);   
}

let sortedArray =sortArray(arr);

console.log("Third largest number : " + sortedArray[2]);

function sortArray(arr) {
    var tmp;
    for (var i = 0; i < arr.length; i++) {
        for (var j = i + 1; j < arr.length; j++) {
            if (arr[i] < arr[j]) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
    }
    return arr;
}