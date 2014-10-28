package com.turtleplayer.persistance.source.sql.query;

import com.turtleplayer.persistance.source.relational.Table;

import java.util.Set;

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

public class TablesPart implements SqlFragment
{
	private final Set<? extends Table> tables;

	public TablesPart(Set<? extends Table> tables)
	{
		this.tables = tables;
	}

	public String toSql()
	{
		String[] tableNames = new String[tables.size()];
		int i = 0;
		for(Table table : tables)
		{
			tableNames[i++] = table.getName();
		}
		return Helper.getSeparatedList(", ", tableNames);
	}
}
