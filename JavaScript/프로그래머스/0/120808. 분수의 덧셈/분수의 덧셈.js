function solution(numer1, denom1, numer2, denom2) {
    let answer = [];
   const newNumer = numer1 * denom2 + numer2 * denom1;
   const newDenom = denom1 * denom2;
   
   const god = findGOD(newNumer, newDenom);
    const simplifiedNumer = newNumer / god;
    const simplifiedDenom = newDenom / god;
    
    answer.push(simplifiedNumer);
    answer.push(simplifiedDenom);
    return answer;
}

function findGOD (a,b) {
    if ( b === 0 ) {
           return a;
       } else {
           return findGOD(b, a % b)
       };
    };
