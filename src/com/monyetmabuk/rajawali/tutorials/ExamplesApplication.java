package com.monyetmabuk.rajawali.tutorials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import android.app.Application;

import com.monyetmabuk.rajawali.tutorials.examples.AExampleFragment;
import com.monyetmabuk.rajawali.tutorials.examples.about.CommunityFeedFragment;
import com.monyetmabuk.rajawali.tutorials.examples.about.MeetTheTeamFragment;
import com.monyetmabuk.rajawali.tutorials.examples.animation.AnimationFragment;
import com.monyetmabuk.rajawali.tutorials.examples.animation.BezierFragment;
import com.monyetmabuk.rajawali.tutorials.examples.animation.CatmullRomFragment;
import com.monyetmabuk.rajawali.tutorials.examples.animation.ColorAnimationFragment;
import com.monyetmabuk.rajawali.tutorials.examples.animation.MD2Fragment;
import com.monyetmabuk.rajawali.tutorials.examples.animation.SkeletalAnimationBlendingFragment;
import com.monyetmabuk.rajawali.tutorials.examples.animation.SkeletalAnimationMD5Fragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.BasicFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.ChaseCameraFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.CollisionDetectionFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.ColoredLinesFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.CurvesFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.LinesFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.OrthographicFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.SVGPathFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.SkyboxFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.TerrainFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.ThreeSixtyImagesFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.UniformDistributionFragment;
import com.monyetmabuk.rajawali.tutorials.examples.general.UsingGeometryDataFragment;
import com.monyetmabuk.rajawali.tutorials.examples.interactive.AccelerometerFragment;
import com.monyetmabuk.rajawali.tutorials.examples.interactive.ObjectPickingFragment;
import com.monyetmabuk.rajawali.tutorials.examples.interactive.TouchAndDragFragment;
import com.monyetmabuk.rajawali.tutorials.examples.lights.DirectionalLightFragment;
import com.monyetmabuk.rajawali.tutorials.examples.lights.MultipleLightsFragment;
import com.monyetmabuk.rajawali.tutorials.examples.lights.PointLightFragment;
import com.monyetmabuk.rajawali.tutorials.examples.lights.SpotLightFragment;
import com.monyetmabuk.rajawali.tutorials.examples.materials.AnimatedGIFTextureFragment;
import com.monyetmabuk.rajawali.tutorials.examples.materials.BumpMappingFragment;
import com.monyetmabuk.rajawali.tutorials.examples.materials.CustomMaterialShaderFragment;
import com.monyetmabuk.rajawali.tutorials.examples.materials.CustomVertexShaderFragment;
import com.monyetmabuk.rajawali.tutorials.examples.materials.MaterialsFragment;
import com.monyetmabuk.rajawali.tutorials.examples.materials.RawShaderFilesFragment;
import com.monyetmabuk.rajawali.tutorials.examples.materials.SpecularAndAlphaFragment;
import com.monyetmabuk.rajawali.tutorials.examples.materials.SphereMapFragment;
import com.monyetmabuk.rajawali.tutorials.examples.materials.ToonShadingFragment;
import com.monyetmabuk.rajawali.tutorials.examples.materials.VideoTextureFragment;
import com.monyetmabuk.rajawali.tutorials.examples.optimizations.Optimized2000PlanesFragment;
import com.monyetmabuk.rajawali.tutorials.examples.optimizations.TextureAtlasFragment;
import com.monyetmabuk.rajawali.tutorials.examples.optimizations.TextureCompressionFragment;
import com.monyetmabuk.rajawali.tutorials.examples.optimizations.UpdateVertexBufferFragment;
import com.monyetmabuk.rajawali.tutorials.examples.parsers.AwdFragment;
import com.monyetmabuk.rajawali.tutorials.examples.parsers.FBXFragment;
import com.monyetmabuk.rajawali.tutorials.examples.parsers.LoadModelFragment;
import com.monyetmabuk.rajawali.tutorials.examples.parsers.LoaderGCodeFragment;
import com.monyetmabuk.rajawali.tutorials.examples.ui.CanvasTextFragment;
import com.monyetmabuk.rajawali.tutorials.examples.ui.TransparentSurfaceFragment;
import com.monyetmabuk.rajawali.tutorials.examples.ui.TwoDimensionalFragment;
import com.monyetmabuk.rajawali.tutorials.examples.ui.UIElementsFragment;

public class ExamplesApplication extends Application {

	static enum Category {

		// @formatter:off
		GENERAL("General")
		, LIGHTS("Lights")
		, INTERACTIVE("Interactive")
		, UI("UI")
		, OPTIMIZATIONS("Optimizations")
		, PARSERS("Parsers")
		, ANIMATION("Animation")
		, MATERIALS("Materials")
		, ABOUT("About");
		// @formatter:on

		private String name;

		Category(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

	}

	public static final Map<Category, ExampleItem[]> ITEMS = new HashMap<Category, ExamplesApplication.ExampleItem[]>();
	public static final ArrayList<TeamMember> TEAM_MEMBERS = new ArrayList<ExamplesApplication.TeamMember>();
	public static final String BASE_EXAMPLES_URL = "https://github.com/MasDennis/RajawaliExamples/blob/master/src/com/monyetmabuk/rajawali/tutorials/examples";

	@Override
	public void onCreate() {
		super.onCreate();

		// @formatter:off
		ITEMS.put(Category.GENERAL, new ExampleItem[] { 
				new ExampleItem("Getting Started", BasicFragment.class) 
				, new ExampleItem("Skybox", SkyboxFragment.class)
				, new ExampleItem("Collision Detection", CollisionDetectionFragment.class)
				, new ExampleItem("Lines", LinesFragment.class)
				, new ExampleItem("Colored Lines", ColoredLinesFragment.class)
				, new ExampleItem("Chase Camera", ChaseCameraFragment.class)
				, new ExampleItem("Using Geometry Data", UsingGeometryDataFragment.class)
				, new ExampleItem("360 Images", ThreeSixtyImagesFragment.class)
				, new ExampleItem("Terrain", TerrainFragment.class)
				, new ExampleItem("Curves", CurvesFragment.class)
				, new ExampleItem("SVG Path", SVGPathFragment.class)
				, new ExampleItem("Uniform Distribution", UniformDistributionFragment.class)
				, new ExampleItem("Orthographic Camera", OrthographicFragment.class)
			});
		ITEMS.put(Category.LIGHTS, new ExampleItem[]{
				new ExampleItem("Directional Light", DirectionalLightFragment.class)
				, new ExampleItem("Point Light", PointLightFragment.class)
				, new ExampleItem("Spot Light", SpotLightFragment.class)
				, new ExampleItem("Multiple Lights", MultipleLightsFragment.class)
			});
		/*
		ITEMS.put(Categories.EFFECTS, new ExampleItem[] {
				new ExampleItem("Particles", ParticlesFragment.class)
				// Post processing is broken, removed until fixed.
				//, new ExampleItem("Touch Ripples", TouchRipplesFragment.class)
				, new ExampleItem("Fog", FogFragment.class)
			});
			*/
		ITEMS.put(Category.INTERACTIVE, new ExampleItem[] {
				new ExampleItem("Using The Accelerometer", AccelerometerFragment.class)
				, new ExampleItem("Object Picking", ObjectPickingFragment.class)
				, new ExampleItem("Touch & Drag", TouchAndDragFragment.class)
			});
		ITEMS.put(Category.UI, new ExampleItem[] {
				new ExampleItem("UI Elements", UIElementsFragment.class)
				, new ExampleItem("2D Renderer", TwoDimensionalFragment.class)
				, new ExampleItem("Transparent GLSurfaceView", TransparentSurfaceFragment.class)
			});
		ITEMS.put(Category.OPTIMIZATIONS, new ExampleItem[] {
				new ExampleItem("2000 Textured Planes", Optimized2000PlanesFragment.class)
				, new ExampleItem("Update Vertex Buffer", UpdateVertexBufferFragment.class)
				, new ExampleItem("Texture Compression (ETC)", TextureCompressionFragment.class)
				, new ExampleItem("Texture Atlas", TextureAtlasFragment.class)
			});
		ITEMS.put(Category.PARSERS, new ExampleItem[] {
				new ExampleItem("Load AWD Model", AwdFragment.class)
				, new ExampleItem("Load OBJ Model", LoadModelFragment.class)
				, new ExampleItem("FBX Scene Importer", FBXFragment.class)
				, new ExampleItem("GCode Toolpaths", LoaderGCodeFragment.class)
			});
		ITEMS.put(Category.ANIMATION, new ExampleItem[] {
				new ExampleItem("Animation", AnimationFragment.class)
				, new ExampleItem("Bezier Path Animation", BezierFragment.class)
				, new ExampleItem("MD2 Animation", MD2Fragment.class)
				, new ExampleItem("Catmul-Rom Splines", CatmullRomFragment.class)
				//, new ExampleItem("Animated Sprites", AnimatedSpritesFragment.class)
				, new ExampleItem("Skeletal Animation (MD5)", SkeletalAnimationMD5Fragment.class)
				, new ExampleItem("Skeletal Animation Blending", SkeletalAnimationBlendingFragment.class)
				, new ExampleItem("Color Animation", ColorAnimationFragment.class)
			});
		ITEMS.put(Category.MATERIALS, new ExampleItem[] {
				new ExampleItem("Materials", MaterialsFragment.class)
				, new ExampleItem("Custom Material", CustomMaterialShaderFragment.class)
				, new ExampleItem("Normal Mapping", BumpMappingFragment.class)
				, new ExampleItem("Toon Shading", ToonShadingFragment.class)
				, new ExampleItem("Custom Vertex Shader", CustomVertexShaderFragment.class)
				, new ExampleItem("Sphere Mapping", SphereMapFragment.class)
				, new ExampleItem("Canvas Text to Material", CanvasTextFragment.class)
				, new ExampleItem("Specular Alpha", SpecularAndAlphaFragment.class)
				, new ExampleItem("Video Texture", VideoTextureFragment.class)
				, new ExampleItem("Loading Shader Textfiles", RawShaderFilesFragment.class)
				, new ExampleItem("Animated GIF Texture", AnimatedGIFTextureFragment.class)
			});
		ITEMS.put(Category.ABOUT, new ExampleItem[] {
			new ExampleItem("Community Stream", CommunityFeedFragment.class)
			, new ExampleItem("Meet The Team", MeetTheTeamFragment.class)
		});
		
		TEAM_MEMBERS.add(new TeamMember(
				R.drawable.photo_rajawali3dcommunity
				, "Rajawali 3D Community"
				, null
				, "https://plus.google.com/communities/116529974266844528013"
			));
		TEAM_MEMBERS.add(new TeamMember(
				R.drawable.photo_andrewjo
				, "Andrew Jo"
				, null
				, "https://plus.google.com/103571530640762510321/posts"
			));
		TEAM_MEMBERS.add(new TeamMember(
				R.drawable.photo_davidtroustine
				, "David Trounstine"
				, "Blue Moon, Spaten, Dos Equis"
				, "https://plus.google.com/100061339163339558529/posts"
			));
		TEAM_MEMBERS.add(new TeamMember(
				R.drawable.photo_dennisippel
				, "Dennis Ippel"
				, "Innis & Gunn, La Chouffe, Duvel"
				, "https://plus.google.com/110899192955767806500/posts"
			));
		TEAM_MEMBERS.add(new TeamMember(
				R.drawable.photo_ianthomas
				, "Ian Thomas"
				, "New Castle, Sapporo, Hopsecutioner"
				, "https://plus.google.com/117877053554468827150/posts"
			));
		TEAM_MEMBERS.add(new TeamMember(
				R.drawable.photo_jaredwoolston
				, "Jared Woolston"
				, "Guinness, Smithwicks, Batch 19, Hoegaarden"
				, "https://plus.google.com/111355740389558136627/posts"
			));
		TEAM_MEMBERS.add(new TeamMember(
				R.drawable.photo_jayweisskopf
				, "Jay Weisskopf"
				, " Allagash, Corona, Hoegaarden"
				, "https://plus.google.com/101121628537383400065/posts"
			));
		// @formatter:on
	}

	public static final class ExampleItem {

		public final Class<? extends AExampleFragment> exampleClass;
		public final String title;
		public final String url;

		public ExampleItem(String title,
				Class<? extends AExampleFragment> exampleClass) {
			this.title = title;
			this.exampleClass = exampleClass;
			this.url = exampleClass.getSimpleName() + ".java";
		}

		public String getUrl(Category category) {
			switch (category) {
			case ABOUT:
				// About category has no example links
				return null;
			default:
				return BASE_EXAMPLES_URL + "/"
						+ category.name.toLowerCase(Locale.US) + "/" + url;
			}
		}
	}

	public static final class TeamMember {
		public int photo;
		public String name;
		public String favoriteBeer;
		public String link;

		protected TeamMember(int photo, String name, String about, String link) {
			this.photo = photo;
			this.name = name;
			this.favoriteBeer = about;
			this.link = link;
		}
	}

}
