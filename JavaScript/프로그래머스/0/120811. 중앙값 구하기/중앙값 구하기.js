function solution(array) {
    let answer = 0;
    array.sort(( a, b ) => a - b );
    let length = array.length;
    let midIndex = Math.trunc( length / 2 );
    let middle = array[midIndex];
    return middle ;
}