package com.turtleplayer.player;

import android.media.MediaPlayer;
import com.turtleplayer.model.Track;

/**
 * TURTLE PLAYER
 * <p/>
 * Licensed under MIT & GPL
 * <p/>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT,
 * TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
 * OR OTHER DEALINGS IN THE SOFTWARE.
 * <p/>
 * More Information @ www.turtle-player.co.uk
 *
 * @author Simon Honegger (Hoene84)
 */

public interface Output
{

	void change(Track t);

	void play(Track t);

	void toggle();

	/**
	 * @return true if this call had an effect
	 */
	boolean pause();

	/**
	 * @return true if this call had an effect
	 */
	boolean play();

	void goToMillis(int millis);

	int getCurrentMillis();

	Track getCurrTrack();

	void setOnCompletionListener(MediaPlayer.OnCompletionListener listener);
}
