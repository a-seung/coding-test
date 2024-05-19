function solution(array) {
    
    array.sort ((a,b) => (a - b));
    const length = array.length;
    const midIndex = Math.trunc(length / 2);
    
    return array[midIndex];
}