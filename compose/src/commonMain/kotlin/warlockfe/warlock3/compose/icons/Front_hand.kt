package warlockfe.warlock3.compose.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Front_hand: ImageVector
	get() {
		if (_Front_hand != null) {
			return _Front_hand!!
		}
		_Front_hand = ImageVector.Builder(
            name = "Front_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
			path(
    			fill = SolidColor(Color.Black),
    			fillAlpha = 1.0f,
    			stroke = null,
    			strokeAlpha = 1.0f,
    			strokeLineWidth = 1.0f,
    			strokeLineCap = StrokeCap.Butt,
    			strokeLineJoin = StrokeJoin.Miter,
    			strokeLineMiter = 1.0f,
    			pathFillType = PathFillType.NonZero
			) {
				moveTo(480f, 480f)
				verticalLineToRelative(-400f)
				quadToRelative(0f, -17f, 11.5f, -28.5f)
				reflectiveQuadTo(520f, 40f)
				reflectiveQuadToRelative(28.5f, 11.5f)
				reflectiveQuadTo(560f, 80f)
				verticalLineToRelative(400f)
				close()
				moveToRelative(-160f, 0f)
				verticalLineToRelative(-360f)
				quadToRelative(0f, -17f, 11.5f, -28.5f)
				reflectiveQuadTo(360f, 80f)
				reflectiveQuadToRelative(28.5f, 11.5f)
				reflectiveQuadTo(400f, 120f)
				verticalLineToRelative(360f)
				close()
				moveTo(500f, 920f)
				quadToRelative(-142f, 0f, -241f, -99f)
				reflectiveQuadToRelative(-99f, -241f)
				verticalLineToRelative(-380f)
				quadToRelative(0f, -17f, 11.5f, -28.5f)
				reflectiveQuadTo(200f, 160f)
				reflectiveQuadToRelative(28.5f, 11.5f)
				reflectiveQuadTo(240f, 200f)
				verticalLineToRelative(380f)
				quadToRelative(0f, 109f, 75.5f, 184.5f)
				reflectiveQuadTo(500f, 840f)
				reflectiveQuadToRelative(184.5f, -75.5f)
				reflectiveQuadTo(760f, 580f)
				verticalLineToRelative(-140f)
				quadToRelative(-17f, 0f, -28.5f, 11.5f)
				reflectiveQuadTo(720f, 480f)
				verticalLineToRelative(160f)
				horizontalLineTo(600f)
				quadToRelative(-33f, 0f, -56.5f, 23.5f)
				reflectiveQuadTo(520f, 720f)
				verticalLineToRelative(40f)
				horizontalLineToRelative(-80f)
				verticalLineToRelative(-40f)
				quadToRelative(0f, -66f, 47f, -113f)
				reflectiveQuadToRelative(113f, -47f)
				horizontalLineToRelative(40f)
				verticalLineToRelative(-400f)
				quadToRelative(0f, -17f, 11.5f, -28.5f)
				reflectiveQuadTo(680f, 120f)
				reflectiveQuadToRelative(28.5f, 11.5f)
				reflectiveQuadTo(720f, 160f)
				verticalLineToRelative(207f)
				quadToRelative(10f, -3f, 19.5f, -5f)
				reflectiveQuadToRelative(20.5f, -2f)
				horizontalLineToRelative(80f)
				verticalLineToRelative(220f)
				quadToRelative(0f, 142f, -99f, 241f)
				reflectiveQuadTo(500f, 920f)
				moveToRelative(40f, -320f)
			}
		}.build()
		return _Front_hand!!
	}

private var _Front_hand: ImageVector? = null
