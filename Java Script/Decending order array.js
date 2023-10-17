function sortDescending(arr) {
    return arr.slice().sort((a, b) => b - a);
}

let inputArray = [5, 2, 8, 1, 4];
let sortedArray = sortDescending(inputArray);

console.log(sortedArray); 