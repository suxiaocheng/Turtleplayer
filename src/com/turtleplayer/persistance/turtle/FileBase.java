package com.turtleplayer.persistance.turtle;

import com.turtleplayer.model.*;
import com.turtleplayer.persistance.framework.filter.Filter;
import com.turtleplayer.persistance.turtle.db.structure.Tables;

import java.util.Collection;

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

/**
 * @param <Q> eg sql as String
 */
public interface FileBase
{
	Collection<? extends Track> getTracks(Filter<? super Tables.Tracks> filter);

	Collection<? extends Album> getAlbums(Filter<? super Tables.Tracks> filter);

	Collection<? extends Artist> getArtists(Filter<? super Tables.Tracks> filter);

	Collection<? extends Genre> getGenres(Filter<? super Tables.Tracks> filter);

	Collection<? extends Song> getSongs(Filter<? super Tables.Tracks> filter);
}
