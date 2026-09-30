/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let res=[]
    arr.forEach((arr,i)=>{
        res.push(fn(arr,i))
    })
    return res;
};