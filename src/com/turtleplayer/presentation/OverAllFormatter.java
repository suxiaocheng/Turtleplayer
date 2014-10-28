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

package com.turtleplayer.presentation;

import com.turtleplayer.model.*;
import com.turtleplayer.util.Shorty;
import com.turtleplayer.util.TurtleUtil;

class OverAllFormatter extends InstanceFormatter
{

	public String visit(Track track)
	{
		String artist = track.GetArtist().getArtistName();
		int number = track.GetNumber();
		String title = track.getSongName();

		if(!Shorty.isVoid(artist) && !Shorty.isVoid(title))
		{
			StringBuilder label = new StringBuilder();
			if(number > 0){
				label.append(number).append(DELIMITER);
			}
			label.append(artist).append(DELIMITER);
			label.append(title);
			return label.toString();
		}
		else
		{
			return TurtleUtil.getLastPartOfPath(track.getAlbumName());
		}

	}

	public String visit(SongDigest track)
	{
		return track.getSongName();
	}

	public String visit(Album album)
	{
		return album.getAlbumName();
	}

	public String visit(GenreDigest genre)
	{
		return genre.getGenreName();
	}

	public String visit(ArtistDigest artist)
	{
		return artist.getArtistName();
	}

	public String visit(FSobject FSobject)
	{
		return FSobject.getPath();
	}
}
