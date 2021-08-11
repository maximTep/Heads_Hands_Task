import kotlin.collections.ArrayList
import kotlin.math.abs
import kotlin.random.Random


fun genArrays(n: Int): ArrayList<ArrayList<Int>>{
    val nums = ArrayList<Int>()

    for(i in 1..3*n) nums.add(i)

    val sizes = ArrayList<Int>()
    for(i in 1..n){
        val r = abs(Random.nextInt()) %(nums.size)
        sizes.add(nums[r])
        nums.removeAt(r)
    }

    val arrays = ArrayList<ArrayList<Int>>()

    for(i in 0..n-1){
        val newArr = ArrayList<Int>()
        for(j in 1..sizes[i]){
            newArr.add(abs(Random.nextInt())%(2*n))
        }
        if(i%2==0) newArr.sort()
        else newArr.sortDescending()

        arrays.add(newArr)
    }

    return arrays
}


fun main(args: Array<String>)
{
    //val n = readLine()?.toInt() ?: return

    val n = args[0].toInt()

    print(genArrays(n))

}




