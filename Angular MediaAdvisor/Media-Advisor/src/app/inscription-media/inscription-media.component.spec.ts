import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InscriptionMediaComponent } from './inscription-media.component';

describe('InscriptionMediaComponent', () => {
  let component: InscriptionMediaComponent;
  let fixture: ComponentFixture<InscriptionMediaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InscriptionMediaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InscriptionMediaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
