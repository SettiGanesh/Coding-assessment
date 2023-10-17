function reverseWords(sentence) {
    
    let words = sentence.split(' ');

    
    let reversedWords = words.map(word => {
        return word.split('').reverse().join('');
    });

    let reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

let inputSentence = "This is a sunny day";
let reversedResult = reverseWords(inputSentence);

console.log(reversedResult); 