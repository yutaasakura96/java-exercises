# Playing Cat

The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.

## Method: `isCatPlaying`

### Parameters
- `summer` (boolean): Represents if it is summer.
- `temperature` (int): Represents the temperature.

### Returns
- `boolean`: Returns `true` if the cat is playing, otherwise returns `false`.

### Description
The method `isCatPlaying` determines if the cat is playing based on the temperature and whether it is summer. The cat plays if the temperature is within the specified range:
- If it is summer (`summer` is `true`), the temperature range is 25 to 45 (inclusive).
- If it is not summer (`summer` is `false`), the temperature range is 25 to 35 (inclusive).

### Examples

```java
isCatPlaying(true, 10); // should return false since temperature is not in range 25 - 45

isCatPlaying(false, 36); // should return false since temperature is not in range 25 - 35 (summer parameter is false)

isCatPlaying(false, 35); // should return true since temperature is in range 25 - 35
```