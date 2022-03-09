const readline = require("readline-sync");

let str1 = readline.question('enter the first word :');
let str2 = readline.question('enter the second word :');

if (str1.length === str2.length) {
    let sortedStr1 = sortString(str1);
    let sortedStr2 = sortString(str2);

    let count =0;

    for(var i=0; i < sortedStr1.length; i++) {
        if(sortedStr1.charAt(i) === sortedStr2.charAt(i))
        {
            count++;
        }
    }

    if(count === sortedStr1.length)
    {
        console.log("these are anagram words")
    }
    else{
        console.log("these are not anagram words")
    }
}
else{
    console.log("these are not anagram words")
}

function sortString(str){
    var arr = str.split('');
    var tmp;
    for(var i = 0; i < arr.length; i++){
      for(var j = i + 1; j < arr.length; j++){  
        if(arr[i] > arr[j]){
          tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }
    return arr.join('');
  }