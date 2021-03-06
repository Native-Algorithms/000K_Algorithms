## Loops

```
for (i in 1..3) {println(i)}
```

Here’s a more generic example:

`for (item in collection) println(item)`

The second type of loop is the while loop,

```
var x = 10while (x > 0) {x--}
```

There is a variation of while known as do-while.

```
var x = 10do {
x--} while (x > 0)
```

## Functions

```
fun max(a: Int, b: Int): Int {return if (a > b) a else b}
```

## Generics


```
class Box {
    var content: Any? = null
    fun put(content: Any?) {
        this.content = content
    }

    fun retrieve(): Any? {
        return content
    }

    fun isEmpty(): Boolean {
        return content == null
    }
}
```

Improve:

```
class Box<T> {
    var content: T? = null
    fun put(content: T?) {
        this.content = content
    }
    fun retrieve(): T? {
        return content
    }
    fun isEmpty(): Boolean {
        return content == null
    }
}
```

Now, to benefit from a specialized box for this generic, you need to instantiate it:

```
    val box = Box<Int>()
    box.put(4)
    val boolBox = Box<Boolean>()
    boolBox.put(true)
    boolBox.isEmpty()
```









