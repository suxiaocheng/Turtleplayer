/**
 *
 * TURTLE PLAYER
 *
 * Licensed under MIT & GPL
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
 * OR OTHER DEALINGS IN THE SOFTWARE.
 *
 * More Information @ www.turtle-player.co.uk
 *
 * @author Simon Honegger (Hoene84)
 */

package com.turtleplayer.preferences;

import android.os.Environment;
import com.turtleplayer.persistance.framework.filter.Filter;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

import java.util.HashSet;
import java.util.Set;

public abstract class Keys
{

	public final static Key<Boolean> SHUFFLE = new Key<Boolean>("shuffle", false);
	public final static Key<String> MEDIA_DIR = new Key<String>("mediaDir",
			  Environment.getExternalStorageDirectory().getPath());

	public final static Key<String> LAST_TRACK_PLAYED = new Key<String>("lastTrackPlayed", null);
	public final static Key<Integer> EXIT_PLAY_TIME = new Key<Integer>("exitPlayTime", 0);

	public final static Key<String> FS_SCAN_INTERRUPT_PATH = new Key<String>("fsScanInterruptPath", null);
	public final static Key<Integer> FS_SCAN_INTERRUPT_COUNT_ALL = new Key<Integer>("fsScanInterruptCountAll", 0);
	public final static Key<Integer> FS_SCAN_INTERRUPT_COUNT_PROCESSED = new Key<Integer>("fsSancInterruptCountProcessed", 0);

	public final static ObjectKey<Set<Filter<? super Tables.Tracks>>> FILTERS = new ObjectKey<Set<Filter<? super Tables.Tracks>>>("filters", new HashSet<Filter<? super Tables.Tracks>>());
}
