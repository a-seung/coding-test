function solution(numbers) {
    
  let doubleEl = [];
    for(let i = 0; i < numbers.length; i++) {
        doubleEl.push( numbers[i] * 2);
    }
    return doubleEl;
}