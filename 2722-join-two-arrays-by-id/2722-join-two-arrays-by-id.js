/**
 * @param {Array} arr1
 * @param {Array} arr2
 * @return {Array}
 */
var join = function(arr1, arr2) {
    let res={}
    for(let i of arr1){
        res[i.id]=i;
    }
    for(let i of arr2){
        res[i.id]={
            ...res[i.id],
            ...i
        }
    }
    return Object.values(res).sort((a,b)=> a.id-b.id)
};