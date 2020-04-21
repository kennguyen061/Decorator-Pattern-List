package cpsc2150.listDec;

import java.util.Collections;
import java.util.List;
import java.util.Random;

/** Kenny Nguyen
 * Zack McGeehan
 */

public interface IShuffleList<T> extends List<T> {

    /**
     *
     * @param swaps number of swaps to call on th elist
     * @pre: swaps > 0
     * @post this.swap(rand_i, rand_j) runs "swaps" times
     */
    default void shuffle(int swaps) {
        Random rand = new Random();
        for(int i = 0; i < swaps; i++) {
            int rand_i = rand.nextInt(this.size());
            int rand_j = rand.nextInt(this.size());
            this.swap(rand_i, rand_j);
        }

    }

    /**
     *
     * @param i first index to swap
     * @param j second index to swap
     * @pre i > 0 && i < this.size()-1 and j > 0 && j < this.size()-1
     * @post Collections.swap(this, i, j)
     */
    default void swap(int i, int j) {
        Collections.swap(this, i, j);
    }

}
